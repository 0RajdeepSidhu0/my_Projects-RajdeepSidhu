Hi there, I created a tiny project that allows you to determine a person's likelihood of loan default. 
I created a website around a machine learning model that I trained to accomplish this, making it simple for anyone to test. 
The project consists of two primary components: a frontend using React (with Vite) and a backend using Flask. 
To make the form appear tidy, I used Bootstrap.

![image](https://github.com/user-attachments/assets/a33d1ad9-a6aa-4e35-955e-dfc53276921c)

In the backend, I used Python with Flask to create an API that takes in some user data (like age, income, credit history, etc.) 
and then returns the probability of defaulting on a loan. 
The machine learning model is saved as a .pkl file and uploaded to Google Drive.
When the Flask app starts, it automatically downloads the model from Drive using a tool called gdown.


![image](https://github.com/user-attachments/assets/a803e8ca-434c-4cbe-93b4-dea40359eb49)

I created a straightforward form on the frontend using React that allows users to enter their information.  
To make the form look good and be easy to use, I utilized Bootstrap.  
The information is delivered to the Flask API once the user completes and submits the form.  
After processing the data and passing it through the model, the API returns the outcome (the default probability).  
The user is then presented with this outcome via the frontend.

I made a backend folder and placed the Flask code and a requirements.txt file with a list of all the Python libraries required (such as Flask, gdown, scikit-learn, etc.) in order to execute the backend.  
All you have to do is run app.py and install the prerequisites. I created a frontend folder and set up the React project using Vite for the frontend.  
You can use npm run dev to launch the frontend after executing npm install. The app is straightforward and functions on your local computer at the moment, 
but I want to make it better by adding more validations, perhaps putting the model on a cloud platform like AWS or GCP, and eventually making it mobile-friendly.
