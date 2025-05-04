import React from 'react';
import InputForm from './components/InputForm';

function App() {
  return (
      <>
      <div className="position-absolute top-0 start-50 translate-middle-x" >
        <h1 className="title" style={{color: '#4ED7F1'}} >Credit Default Prediction</h1>
        <InputForm/>
      </div>
      </>
  );
}

export default App;
