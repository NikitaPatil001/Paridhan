import React from 'react';
import axios from 'axios';

const Sell = () => {

  const [formValue, setformValue] = React.useState({
    date: '',
    customerName: '',
    itemName: '',
    unitPrice: '',
    quantity: ''
  });

  const handleSubmit = async () => {
    // store the states in the form data
    const additem = new FormData();
    additem.append("customerName", formValue.customerName)
    additem.append("itemName", formValue.itemName)
    additem.append("date", formValue.date)
    additem.append("unitPrice", formValue.unitPrice)
    additem.append("quantity", formValue.quantity)

    try {
      // make axios post request
      const response = await axios({
        method: "post",
        url: "http://localhost:8080/sell/add",
        data: additem,
        headers: { "Content-Type": "multipart/form-data" },
      });
    } catch (error) {
      console.log(error)
    }
  }

  const handleChange = (event) => {
    setformValue({
      ...formValue,
      [event.target.name]: event.target.value
    });
  }

  return (
    <form onSubmit={handleSubmit}>
      <p>Add Item</p>
      <input
        type="date"
        name="date"
        placeholder="enter an date"
        value={formValue.date}
        onChange={handleChange}
      /><br></br>
      <input
        type="customerName"
        name="customerName"
        placeholder="enter an customerName"
        value={formValue.customerName}
        onChange={handleChange}
      /> <br></br>
      <input
        type="itemName"
        name="itemName"
        placeholder="enter a itemName"
        value={formValue.itemName}
        onChange={handleChange}
      />
      <br></br>
      <input
        type="number"
        name="quantity"
        placeholder="enter an quantity"
        value={formValue.quantity}
        onChange={handleChange}
      /> <br></br>
      <input
        type="number"
        name="unitPrice"
        placeholder="enter an unitPrice"
        value={formValue.unitPrice}
        onChange={handleChange}
      />

      <button
        type="submit"
      >
        Add Item
      </button>
    </form>
  )
};

export default Sell;