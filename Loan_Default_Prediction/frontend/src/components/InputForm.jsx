import React, { useState } from 'react';
import axios from 'axios';

const InputForm = () => {
  const [formData, setFormData] = useState({
    RevolvingUtilizationOfUnsecuredLines: 0.9,
    age: 60,
    NumberOfTime30_59DaysPastDueNotWorse: 9,
    DebtRatio: 0.8,
    MonthlyIncome: 15000,
    NumberOfOpenCreditLinesAndLoans: 15,
    NumberOfTimes90DaysLate: 0,
    NumberRealEstateLoansOrLines: 1,
    NumberOfTime60_89DaysPastDueNotWorse: 0,
    NumberOfDependents: 3,
  });

  const [result, setResult] = useState(null);

  const handleChange = (e) => {
    setFormData((prev) => ({
      ...prev,
      [e.target.name]: parseFloat(e.target.value),
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const res = await axios.post('http://127.0.0.1:5000/predict', formData);
      setResult(res.data.default_probability);
    } catch (error) {
      console.error(error);
      alert("Something went wrong. Make sure the backend is running.");
    }
  };

  return (
    <div className="container mt-4" style={{color: '#000', fontFamily: 'Arial, sans-serif'}}>
      <form onSubmit={handleSubmit}>
        {Object.entries(formData).map(([key, value]) => (
          <div className="mb-3" key={key}>
            <label htmlFor={key} className="form-label">
              {key.replaceAll('_', ' ')}
            </label>
            <input
              type="number"
              className="form-control"
              id={key}
              name={key}
              step="any"
              value={value}
              onChange={handleChange}
              required
            />
          </div>
        ))}

        <button type="submit" className="btn btn-primary w-100" style={{backgroundColor: '#4ED7F1', borderColor: '#4ED7F1'}}>
          Predict
        </button>
      </form>

      {result !== null && (
        <div className="alert alert-info text-center mt-4">
          <h4>Probability of Default: {Math.round(result * 100)}%</h4>
        </div>
      )}
    </div>
  );
};

export default InputForm;
