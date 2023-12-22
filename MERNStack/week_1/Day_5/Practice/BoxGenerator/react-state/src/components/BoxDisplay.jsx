import React from 'react';

const BoxDisplay = ({ boxs }) => {
  console.log(boxs);

  return (
    <div>
      {boxs.map((element, idx) => (
        <div key={idx} style={{ backgroundColor: `${element}`, width: "100px", height: "100px" }}>
          <h2>{idx}</h2>
        </div>
      ))}
    </div>
  );
};

export default BoxDisplay;
