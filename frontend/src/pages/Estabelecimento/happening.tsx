import React from "react";
import "./styles.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faArrowDown, faCalendar } from "@fortawesome/free-solid-svg-icons";

const Happening: React.FC = () => {
  return (
    <section id="happening" className="happening">
      <div className="event-announcement">
        <h1>Acontecendo agora!</h1>
        <FontAwesomeIcon icon={faArrowDown} className="arrow-down" />
      </div>

      <div className="event-cards-container">
        <div className="event-card">
          <img
            src="src/assets/photosExample/event-1.jpg"
            alt="Event 1"
            className="event-image gradient"
          />
          <div className="event-details">
            <h3>Event Title 1</h3>
            <p>Short description of event 1. This can be a few lines long.</p>
          </div>
          <div className="overlay">
            <div className="overlay-content">
              <div className="overlay-time">
                <h3> Encerra em: </h3>
                <FontAwesomeIcon icon={faCalendar} /> {<span>99/99/1999</span>}
              </div>
              <h2>Aproveite!</h2>
            </div>
          </div>
        </div>
        <div className="event-card">
          <img
            src="src/assets/photosExample/event-2.jpg"
            alt="Event 2"
            className="event-image gradient"
          />
          <div className="event-details">
            <h3>Event Title 2</h3>
            <p>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit,
              excepturi eveniet deleniti a nesciunt alias id iste assumenda
              eligendi perspiciatis natus
            </p>
          </div>
          <div className="overlay">
            <div className="overlay-content">
              <div className="overlay-time">
                <h3> Encerra em: </h3>
                <FontAwesomeIcon icon={faCalendar} /> {<span>99/99/1999</span>}
              </div>
              <h2>Aproveite!</h2>
            </div>
          </div>
        </div>
        <div className="event-card">
          <img
            src="src/assets/photosExample/event-1.jpg"
            alt="Event 1"
            className="event-image gradient"
          />
          <div className="event-details">
            <h3>Event Title 1</h3>
            <p>Short description of event 1. This can be a few lines long.</p>
          </div>
          <div className="overlay">
            <div className="overlay-content">
              <div className="overlay-time">
                <h3> Encerra em: </h3>
                <FontAwesomeIcon icon={faCalendar} /> {<span>99/99/1999</span>}
              </div>
              <h2>Aproveite!</h2>
            </div>
          </div>
        </div>
        <div className="event-card">
          <img
            src="src/assets/photosExample/event-2.jpg"
            alt="Event 2"
            className="event-image gradient"
          />
          <div className="event-details">
            <h3>Event Title 2</h3>
            <p>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit,
              excepturi eveniet deleniti a nesciunt alias id iste assumenda
              eligendi perspiciatis natus
            </p>
          </div>
          <div className="overlay">
            <div className="overlay-content">
              <div className="overlay-time">
                <h3> Encerra em: </h3>
                <FontAwesomeIcon icon={faCalendar} /> {<span>99/99/1999</span>}
              </div>
              <h2>Aproveite!</h2>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default Happening;
