import React, { useState } from  'react';
import "./form_modules.css"

const UserForm = (props) => {
  const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmpassword, setConfirmPaswword] = useState("");  
    const [error, setError] = useState("");
    const [errorEmail, setErrorEmail] = useState("");
    const [errorpassword, setErrorPassword] = useState("");
    const [errorconfirmpassword, setErrorConfirmPassword] = useState("");
    
    const createUser = (e) => {
        // we must prevent the default refresh of the browser to keep our state from being reset
        e.preventDefault();
        
        // shorthand ES6 syntax for building an object - see notes above
        const newUser = { username, email, password,confirmpassword };
        console.log("Welcome", newUser);
    
    };
    const checkLength=(value)=>{
      setUsername(value)
      if (value.length<3){
      setError("that field must be at least 5 characters");}
      else{
        setError("")
      }
    }
    const checkLengthEmail=(value)=>{
      setEmail(value)
      if (value.length<9){
      setErrorEmail("Email must be at least 8 characters");}
      else{
        setErrorEmail("")
      }
    }
    const checkLengthPassword=(value)=>{
      setPassword(value)
      if (value.length<3){
      setErrorPassword("Password must be at least 2 characters");}
      else{
        setErrorPassword("")
      }
    }
    const checkLengthConfirmPassword=(value)=>{
      setConfirmPaswword(value)
      if (value.length<9){
        setErrorConfirmPassword("Password must be at least 8 characters");}
      else{
        setErrorConfirmPassword("")
      }
    }
    
  return (
    <form onSubmit={ createUser }>
    <div>
        <label>Username: </label> 
        <input type="text" value={username} onChange={ (e) => checkLength(e.target.value) } />
        <p>{error}</p>
    </div>
    <div>
        <label>Email Address: </label> 
        <input type="text" value={email} onChange={ (e) => checkLengthEmail(e.target.value) } />
        <p>{errorEmail}</p>
    </div>
    <div>
        <label>Password: </label>
        <input type="text" value={password} onChange={ (e) => checkLengthPassword(e.target.value) } />
        <p>{errorpassword}</p>
    
    </div>
    <div>
        <label>confirmPassword: </label>
        <input type="text" value={confirmpassword} onChange={ (e) => checkLengthConfirmPassword(e.target.value) } />
        <p>{errorconfirmpassword}</p>
    </div>
    <input type="submit" value="Create User" className='btn btn-danger'/>
</form>
  )
}

export default UserForm