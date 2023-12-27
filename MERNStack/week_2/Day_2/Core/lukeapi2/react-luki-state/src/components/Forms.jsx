import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const Forms = () => {
  const[ peopleId,setPeopleId]= useState();

  const[ select,setSelect]= useState("people");

  function handleAddrTypeChange(e) {

    setSelect(e.target.value);}

  const navigate= useNavigate();


  const handleSubmit=(e)=>{

    e.preventDefault();

    navigate("/"+select+"/"+ peopleId);
  };
  return (
  <div>
    <h1>{peopleId}</h1>
  <form onSubmit={handleSubmit}>
    <div>
    <label>id:</label>
    <input type="number" onChange={(e)=>{ setPeopleId(e.target.value)}} />
    </div>
    <div>
      <label >search for:</label>
      <select onChange={handleAddrTypeChange}>
        <option value="people">people</option>
        <option value="planets">planets</option>
      </select>
    </div>
    <button > search</button>

  </form>
  </div>
  )
}

export default Forms