import React from "react";
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import '../Home/Home.css'

const list=[1,2,3,4,5]
const  cardsdisplay= list.map(() =>
<Card style={{width: '20rem' }}>
<Card.Img variant="top" src="https://cdn.shopify.com/s/files/1/0210/2968/3222/articles/trending_products_to_sell_in_India_ad8fc9e0-5052-44bf-bd93-7bec4335f5ee.jpg?v=1647462399" />
<Card.Body>
  <Card.Title>Course Name</Card.Title>
  <Card.Text>
    Course Description
  </Card.Text>
  <Button variant="primary">Enroll</Button>
</Card.Body>
</Card>
);
function Home() {
  return (
    <div className="Cards">
        {cardsdisplay}
    </div>
  );
}

export default Home;