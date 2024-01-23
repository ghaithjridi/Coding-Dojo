import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import Form from 'react-bootstrap/Form';



const Create = () => {
    const [title,setTitle]=useState("")
    const[price,setPrice]=useState("")
    const[description,setDescription]=useState("")

    const navigate = useNavigate();

    const submitHandler =(e)=>{

        e.preventDefault()
        const createdProduct={
            title,
            price,
            description,
        };
        axios.post("http://localhost:8000/api/products",createdProduct)
        .then((res)=>{navigate("/")})
        .catch((err)=>console.log(err));
        setTitle("")
        setPrice("")
        setDescription("")
    };
return (
    <div>
<form  onSubmit={submitHandler}>
    <div>
    <Form.Group className="mb-3">
    <Form.Label>Title:</Form.Label>
        <input type="text" onChange={(e)=>setTitle(e.target.value)} value={title}/>
        
        </Form.Group>
    </div>
    <div>
    <Form.Group className="mb-3">
    <Form.Label>Price:</Form.Label>
        <input type="number" onChange={(e)=>{setPrice(e.target.value)}} value={price}/>
        </Form.Group>
    </div>
    <div>
    <Form.Group className="mb-3">
    <Form.Label>Description:</Form.Label>
        <input type="text"  onChange={(e)=>{setDescription(e.target.value)}} value={description}/>
        </Form.Group>
    </div>
    <button >Create </button>

</form>

    </div>
)
}

export default Create