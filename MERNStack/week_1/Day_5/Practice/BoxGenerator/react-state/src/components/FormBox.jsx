// import { useState } from "react"
// import "./FormDisplay.css"
// import BoxDisplay from "./BoxDisplay";
// const FormBox = (props) => {
//     const[box,setBox]= useState("");
//     const[bar,setBar]= useState([]);
//     console.log(box)
//     const handleSubmit =(e)=> {
//         e.preventDefault();
//         setBox([...box,bar])
//         setBar('')
//     };
//     return (
//     <form className='form' onSubmit={handleSubmit}>
//         <p>{JSON.stringify(box)}</p>
//         <h1>Color</h1>
//         <input type="color" onChange={(e)=>{setBar(e.target.value)}}/>
//     <button>Add</button>
//     <BoxDisplay box={box } />
//     </form>
// )
// }

// export default FormBox