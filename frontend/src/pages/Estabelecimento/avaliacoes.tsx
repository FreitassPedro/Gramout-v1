import React from "react";

const Avaliacoes: React.FC = () => {
  return (
    // Avaliacoes
    <section id="avaliacoes" className="avaliacoes">
      <div>
        <h1>Avaliacoes</h1>
        <div className="rate-container">
          <div className="rate-card">
            <div className="rate-user-basics">
              <div className="rate-user-icon">
                <img
                  src="src/assets/photosExample/user-icon-1.jpg"
                  alt="user-icon"
                />
              </div>
              <span>Nome do Usuário</span>
            </div>
            <div className="user-rating">
              <span>5 ★★★★★</span>
              <span>Title</span>
            </div>
            <div className="rate-description">
              <span>
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Quisquam voluptates, quos, explicabo consequatur
              </span>
            </div>
          </div>

          <div className="rate-card">
            <div className="rate-user-basics">
              <div className="rate-user-icon">
                <img
                  src="src/assets/photosExample/user-icon-1.jpg"
                  alt="user-icon"
                />
              </div>
              <span>Nome do Usuário</span>
            </div>
            <div className="user-rating">
              <span>4 ★★★★☆</span>
              <span>Title</span>
            </div>
            <div className="rate-description">
              <span>
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Quisquam voluptates, quos, explicabo consequatur
              </span>
            </div>
          </div>

            <div className="rate-card">
                <div className="rate-user-basics">
                <div className="rate-user-icon">
                    <img
                    src="src/assets/photosExample/user-icon-1.jpg"
                    alt="user-icon"
                    />
                </div>
                <span>Nome do Usuário</span>
                </div>
                <div className="user-rating">
                <span>3 ★★★☆☆</span>
                <span>Title</span>
                </div>
                <div className="rate-description">
                <span>
                    Lorem ipsum dolor sit amet
                </span>
                </div>
            </div>

        </div>
      </div>
    </section>
  );
};

export default Avaliacoes;
