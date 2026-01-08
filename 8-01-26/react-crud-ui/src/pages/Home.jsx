import { useEffect, useState } from "react";
import { getUsers } from "../services/api";
import UserForm from "../components/UserForm";
import UserList from "../components/UserList";

export default function Home() {
  const [users, setUsers] = useState([]);

  const fetchUsers = async () => {
    const res = await getUsers();
    setUsers(res.data);
  };

  useEffect(() => {
    fetchUsers();
  }, []);

  return (
    <>
      <UserForm refresh={fetchUsers} />
      <UserList users={users} refresh={fetchUsers} />
    </>
  );
}
