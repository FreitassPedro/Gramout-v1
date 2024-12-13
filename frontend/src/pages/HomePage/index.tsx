const HomePage = () => {
  return (
    <div>
      <h1>Home Page</h1>
      <header>
        <nav>
          <ul>
            <li>
              <a href="/">Home</a>
            </li>
            <li>
              <a href="/estabelecimento">Estabelecimento</a>
            </li>
            <li>
              <a href="/contato">Contato</a>
            </li>
          </ul>
        </nav>
      </header>
      <img src="/logo.svg" alt="React Logo" />
    </div>
  );
};

export default HomePage;
