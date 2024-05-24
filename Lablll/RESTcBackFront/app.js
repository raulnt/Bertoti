const apiUrl = 'http://localhost:8080/cliente';

document.addEventListener('DOMContentLoaded', () => {
    loadClientes();

    const form = document.getElementById('clienteForm');
    form.addEventListener('submit', function(event) {
        event.preventDefault();
        const id = document.getElementById('clienteId').value;
        const nome = document.getElementById('nome').value;
        const email = document.getElementById('email').value;
        const cpf = document.getElementById('cpf').value;

        const cliente = { nome, email, cpf };
        
        if (id) {
            atualizarCliente(id, cliente);
        } else {
            salvarCliente(cliente);
        }
    });
});

function loadClientes() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const tableBody = document.getElementById('clienteTableBody');
            tableBody.innerHTML = '';

            data.forEach(cliente => {
                adicionarClienteNaTabela(cliente);
            });
        });
}

function salvarCliente(cliente) {
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(cliente)
    }).then(response => {
        if (response.ok) {
            response.json().then(newCliente => {
                adicionarClienteNaTabela(newCliente);
                document.getElementById('clienteForm').reset();
            });
        }
    });
}

function atualizarCliente(id, cliente) {
    fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(cliente)
    }).then(response => {
        if (response.ok) {
            loadClientes();
            document.getElementById('clienteForm').reset();
        }
    });
}

function removerCliente(id) {
    fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
    }).then(response => {
        if (response.ok) {
            loadClientes();
        }
    });
}

function editarCliente(id) {
    fetch(`${apiUrl}/${id}`)
        .then(response => response.json())
        .then(cliente => {
            document.getElementById('clienteId').value = cliente.id;
            document.getElementById('nome').value = cliente.nome;
            document.getElementById('email').value = cliente.email;
            document.getElementById('cpf').value = cliente.cpf;
        });
}

function adicionarClienteNaTabela(cliente) {
    const tableBody = document.getElementById('clienteTableBody');
    const row = document.createElement('tr');

    row.innerHTML = `
        <td>${cliente.id}</td>
        <td>${cliente.nome}</td>
        <td>${cliente.email}</td>
        <td>${cliente.cpf}</td>
        <td>
            <button onclick="editarCliente(${cliente.id})">Editar</button>
            <button onclick="removerCliente(${cliente.id})">Remover</button>
        </td>
    `;

    tableBody.appendChild(row);
}
