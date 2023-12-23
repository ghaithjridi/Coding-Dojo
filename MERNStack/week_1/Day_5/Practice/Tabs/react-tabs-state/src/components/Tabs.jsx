import React, { useState } from 'react'

const Tabs = () => { 
    const tab =["tab 1","tab 2","tab3"];
    const [msg,setMsg]= useState('') 
    const clickhandler=(e,y,i)=>{

        e.preventDefault();
        setMsg(y + "showing here");
    }
return (
    <div>
    { tab.map((value,i)=>{
        return <button   key={i} onClick={(e)=> clickhandler(e,value,i)}>{value}</button>
    })
    }
    <p>{msg}</p>

    </div>
)
}

export default Tabs