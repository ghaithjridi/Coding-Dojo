import React, { useState} from 'react';

const Tasks = (props) => {
    const { value, task, tasks, setTasks } = props;

    const checkbox = (e) => {
        setTasks(tasks.map((item, idx) => {
            if (idx == value) {
                item.completed ?
                    item.completed = false :
                    item.completed = true
                return item;
            }
            else {
                return item;
            }
        }))
    };

    const deleteTask = (e) => {
        setTasks(tasks.filter((task, index) => {
            return (index !== value);
        }))
    }

    return (
        <>
            <span>{task.task}</span> <input type="checkbox" id="completed" onChange={checkbox} checked={task.completed} /> <button onClick={deleteTask}>Delete</button>
        </>
    );
}

export default Tasks;