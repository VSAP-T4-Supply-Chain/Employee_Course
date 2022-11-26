import Home from "./Components/Home/Home"
import { BrowserRouter, Routes, Route } from "react-router-dom"
import Login from "./Components/Login/Login"
import NavigateBar  from "./Components/Navbar/Navbar"
import Courses from "./Components/Courses/Courses"

function App() {
  return (
    <>
      <NavigateBar />
      <BrowserRouter>
        <Routes>
          <Route className="login" path="/login" element={<Login />} />
          <Route className="home" path="/" element={<Home />} />
          <Route className="home" path="/home" element={<Home />} />
          <Route className="courses" path="/courses" element={<Courses />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App