import React from 'react'
import './signup.css'

const Signup=()=>{
       return(
             <div className='page'>
            <div className='cover'>
               <h1>Login</h1>
                <input type="email" placeholder='Email'/>
                <input type="password" placeholder='Password' />
           
            <div className='login-btn'>Login</div>
            <p className='text'>or login using</p>
            <div className='alt-login'>
               <div className='facebook'></div>
               <div className='google'></div>
            </div>
            </div>
            </div>
       );
}

export default Signup