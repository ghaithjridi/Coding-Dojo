import React, { useState} from 'react';

const Form = (props) => {
    const { tasks, setTasks } = props;

    const [form, setForm] = useState({ text: '' });

    const onChange = (e) => {
        setForm({ ...form, text: e.target.value });
    }

    const handleSubmit = (e) => {
        e.preDefault();
        setTasks([...tasks, { task: form.text, completed: false }]);
        setForm({ ...form, text: "" });
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <label htmlFor="">Add a task here:</label>
                <input type="text" />
                <form type="text"  onChange={onChange} value={form.text} />
                <button>Add Task</button>
            </form>
        </>
    );
}

export default Form;