<h2><a href="https://leetcode.com/problems/rearrange-products-table/">1795. Rearrange Products Table</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi" style="user-select: auto;"><a class="sql-schema-link__3cEg" style="user-select: auto;">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2" style="user-select: auto;"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z" style="user-select: auto;"></path></svg></a></div><div style="user-select: auto;"><p style="user-select: auto;">Table: <code style="user-select: auto;">Products</code></p>

<pre style="position: relative; user-select: auto;">+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_id  | int     |
| store1      | int     |
| store2      | int     |
| store3      | int     |
+-------------+---------+
product_id is the primary key (column with unique values) for this table.
Each row in this table indicates the product's price in 3 different stores: store1, store2, and store3.
If the product is not available in a store, the price will be null in that store's column.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;">Write a solution to rearrange the <code style="user-select: auto;">Products</code> table so that each row has <code style="user-select: auto;">(product_id, store, price)</code>. If a product is not available in a store, do <strong style="user-select: auto;">not</strong> include a row with that <code style="user-select: auto;">product_id</code> and <code style="user-select: auto;">store</code> combination in the result table.</p>

<p style="user-select: auto;">Return the result table in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">The result format is in the following example.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
Products table:
+------------+--------+--------+--------+
| product_id | store1 | store2 | store3 |
+------------+--------+--------+--------+
| 0          | 95     | 100    | 105    |
| 1          | 70     | null   | 80     |
+------------+--------+--------+--------+
<strong style="user-select: auto;">Output:</strong> 
+------------+--------+-------+
| product_id | store  | price |
+------------+--------+-------+
| 0          | store1 | 95    |
| 0          | store2 | 100   |
| 0          | store3 | 105   |
| 1          | store1 | 70    |
| 1          | store3 | 80    |
+------------+--------+-------+
<strong style="user-select: auto;">Explanation:</strong> 
Product 0 is available in all three stores with prices 95, 100, and 105 respectively.
Product 1 is available in store1 with price 70 and store3 with price 80. The product is not available in store2.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>
</div>