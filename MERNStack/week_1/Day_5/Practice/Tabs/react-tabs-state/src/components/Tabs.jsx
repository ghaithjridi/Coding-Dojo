import React, { useState } from 'react'

const Tabs = () => { 
    const tab =["tab 1","tab 2","tab3"];
    const [msg,setMsg]= useState('') 
    const clickhandler=(e,y,i)=>{

        e.preventDefault();
        setMsg(y + "showing here");
    }
return (
<fieldset>
    <div>
    { tab.map((value,i)=>{
        return <button   key={i} onClick={(e)=> clickhandler(e,value,i)}>{value}</button>
    })
    }
    <p>{msg}</p>

    </div>
    </fieldset>
)
}

export default Tabs