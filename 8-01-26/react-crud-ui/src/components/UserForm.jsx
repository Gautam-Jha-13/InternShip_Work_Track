import { useState, useEffect } from "react";

const UserForm = ({ onSubmit, selectedUser, clearSelection }) => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  useEffect(() => {
    if (selectedUser) {
      setName(selectedUser.name);
      setEmail(selectedUser.email);
    }
  }, [selectedUser]);

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit({ name, email });
    setName("");
    setEmail("");
  };

  return (
    <form className="card" onSubmit={handleSubmit}>
      <h3>{selectedUser ? "Update User" : "Create User"}</h3>

      <input
        placeholder="Name"
        value={name}
        required
        onChange={(e) => setName(e.target.value)}
      />

      <input
        placeholder="Email"
        value={email}
        required
        onChange={(e) => setEmail(e.target.value)}
      />

      <button className="btn green" type="submit">
        {selectedUser ? "Update" : "Create"}
      </button>

      {selectedUser && (
        <button className="btn gray" type="button" onClick={clearSelection}>
          Cancel
        </button>
      )}
    </form>
  );
};

export default UserForm;
