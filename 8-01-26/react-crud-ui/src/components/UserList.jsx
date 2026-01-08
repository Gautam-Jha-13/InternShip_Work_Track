const UserList = ({ users, onEdit, onDelete }) => {
  return (
    <div className="card">
      <h3>Users</h3>

      {users.length === 0 ? (
        <p>No users found</p>
      ) : (
        users.map((user) => (
          <div className="user-row" key={user.id}>
            <div>
              <b>{user.name}</b>
              <p>{user.email}</p>
            </div>

            <div className="actions">
              <button className="btn blue" onClick={() => onEdit(user)}>
                Edit
              </button>
              <button
                className="btn red"
                onClick={() => onDelete(user.id)}
              >
                Delete
              </button>
            </div>
          </div>
        ))
      )}
    </div>
  );
};

export default UserList;
