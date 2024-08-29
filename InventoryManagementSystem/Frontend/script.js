document.addEventListener('DOMContentLoaded', () => {
    const productTable = document.getElementById('product-table');

    // Sample product data
    const products = [
        { name: 'Laptop', category: 'Electronics', stock: 20, price: 800 },
        { name: 'Chair', category: 'Furniture', stock: 15, price: 50 },
        { name: 'Headphones', category: 'Electronics', stock: 50, price: 100 },
    ];

    function renderProducts() {
        productTable.innerHTML = '';
        products.forEach(product => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${product.name}</td>
                <td>${product.category}</td>
                <td>${product.stock}</td>
                <td>$${product.price}</td>
                <td><button class="btn">Edit</button> <button class="btn">Delete</button></td>
            `;
            productTable.appendChild(row);
        });
    }

    // Show modal
    function openModal() {
        document.getElementById('modal').style.display = 'flex';
    }

    // Close modal
    function closeModal() {
        document.getElementById('modal').style.display = 'none';
    }

    // Add new product
    const productForm = document.getElementById('product-form');
    productForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const name = document.getElementById('product-name').value;
        const category = document.getElementById('category').value;
        const stock = document.getElementById('stock').value;
        const price = document.getElementById('price').value;

        products.push({ name, category, stock, price });
        renderProducts();
        closeModal();
    });

    // Initial rendering of products
    renderProducts();
});
