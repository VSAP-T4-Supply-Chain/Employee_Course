import React from "react"
import '../Login/Login.css'
export default function Login() {
  return (
    <div className="login-form">
    <form>
      <h1>Login</h1>
      <div className="content">
        <div className="input-field">
          <input type="email" placeholder="Email" autocomplete="off"/>
        </div>
        <div className="input-field">
          <input type="password" placeholder="Password" autocomplete="off"/>
        </div>
      </div>
      <div className="action">
        <button>Sign in</button>
      </div>
    </form>
  </div>
  )
}