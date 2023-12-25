import './App.css';
import {useState} from "react";
import axios from 'axios';

function App() {
const [pokemons,setPokemons]=useState([]);

  // const fetchPokemon=()=>{
  //   fetch("https://pokeapi.co/api/v2/pokemon")
  //   .then((serverResponse)=>  serverResponse.json())
  //   .then((jsonResponse)=>{
  //     console.log(jsonResponse);
  //     const data = jsonResponse.results
  //     setPokemons(data)
  //   }
  //   )
  //   .catch((errorResponse)=>console.log(errorResponse))

  // };

  const axiosPokemon=()=>{
    axios
    .get("https://pokeapi.co/api/v2/pokemon")
    .then((response) =>setPokemons(response.data.results) )
    .catch((error)=> console.log(error))


  };
  console.log(pokemons);
  return (
    <div className="App">
    {/* <button onClick={fetchPokemon}> Fetch Pokemon</button> */}
    <button onClick={axiosPokemon}> Axios Pokemon </button>

      <ul>
        {pokemons.map((onepokemon,idx)=>(
          <li key={idx}>
            {onepokemon.name}
          </li>
        ))}
        
      </ul>


      
    </div>
  );
    }

export default App;