import { useEffect, useState } from "react";
import "./App.css";
import UserForm from "./components/UserForm";
import UserList from "./components/UserList";
import {
  getUsers,
  createUser,
  updateUser,
  deleteUser,
} from "./services/api";

function App() {
  const [users, setUsers] = useState([]);
  const [selectedUser, setSelectedUser] = useState(null);

  const loadUsers = async () => {
    const res = await getUsers();
    setUsers(res.data);
  };

  useEffect(() => {
    loadUsers();
  }, []);

  const handleCreateOrUpdate = async (user) => {
    if (selectedUser) {
      await updateUser(selectedUser.id, user);
      setSelectedUser(null);
    } else {
      await createUser(user);
    }
    loadUsers();
  };

  return (
    <div className="container">
      <h1>MongoDB CRUD Dashboard</h1>

      <UserForm
        onSubmit={handleCreateOrUpdate}
        selectedUser={selectedUser}
        clearSelection={() => setSelectedUser(null)}
      />

      <UserList
        users={users}
        onEdit={setSelectedUser}
        onDelete={async (id) => {
          await deleteUser(id);
          loadUsers();
        }}
      />
    </div>
  );
}

export default App;
