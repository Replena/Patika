import React, { useEffect, useState } from "react";
import getData from "./lib/service";

const App = () => {
  const [userData, setUserData] = useState(null);

  useEffect(() => {
    getData(4).then((data) => {
      console.log("Tüm Kullanıcı Verileri:", data);
      setUserData(data);
    });
  }, []);

  return (
    <div>
      <h1>Kullanıcı Bilgileri</h1>
      {userData ? (
        <div>
          <h2>{userData.name}</h2>
          <p>
            <strong>Email:</strong> {userData.email}
          </p>
          <p>
            <strong>Şirket:</strong> {userData.company.name}
          </p>
        </div>
      ) : (
        <p>Veri yükleniyor...</p>
      )}
    </div>
  );
};

export default App;
