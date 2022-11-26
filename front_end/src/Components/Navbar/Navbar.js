import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import './Navbar.css';

export default function NavigateBar() {
  return (
    <Navbar bg="danger" expand="lg" >
      <Container >
        <Navbar.Brand href="/home">Employee Course</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Nav className="me-auto">
            <Nav.Link href="/home">Home</Nav.Link>
            <Nav.Link href="/list">List of Available Courses</Nav.Link>
            <NavDropdown title="Courses" id="basic-nav-dropdown">
              <NavDropdown.Item href="/Available">Available Courses</NavDropdown.Item>
              <NavDropdown.Item href="/Mandatory">Mandatory Courses</NavDropdown.Item>
            </NavDropdown>
            <Nav.Link className="justify-content-end" href="/login">Log In</Nav.Link>
            <Nav.Link className='justify-content-end' href="/logout">Log Out</Nav.Link>
          </Nav>
      </Container>
    </Navbar>
  );
}