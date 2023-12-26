import React from 'react'
import { useParams } from 'react-router-dom'

const Color = () => {
    const{word , color1,color2}=useParams();
    const isNumeric= isNaN(word)
    const style={
        backgroundColor:color1,
        color:color2,
    };
return (

<>
{isNumeric?(

    <h1 style={style}>the word is:{word}</h1>
):(
<h1> the number is{word}</h1>
)}



</>
)
}

export default Color