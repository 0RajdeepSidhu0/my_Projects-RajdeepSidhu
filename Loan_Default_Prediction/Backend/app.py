from flask import Flask, request, jsonify
import pickle
import numpy as np
import sklearn 
from flask_cors import CORS

app = Flask(__name__)
CORS(app)
with open('model.pkl', 'rb') as f:
    model = pickle.load(f)

@app.route('/predict', methods=['POST'])
def predict():
    data = request.json
    input_features = [
        data['RevolvingUtilizationOfUnsecuredLines'],
        data['age'],
        data['NumberOfTime30_59DaysPastDueNotWorse'],
        data['DebtRatio'],
        data['MonthlyIncome'],
        data['NumberOfOpenCreditLinesAndLoans'],
        data['NumberOfTimes90DaysLate'],
        data['NumberRealEstateLoansOrLines'],
        data['NumberOfTime60_89DaysPastDueNotWorse'],
        data['NumberOfDependents']
    ]

    input_array = np.array(input_features).reshape(1, -1)
    probability = model.predict_proba(input_array)[0][1]

    return jsonify({
        'default_probability': round(float(probability), 4)  
    })

if __name__ == '__main__':
    app.run(debug=True)
