<h2><a href="https://leetcode.com/problems/count-salary-categories/">1907. Count Salary Categories</a></h2><h3>Medium</h3><hr><div class="sql-schema-wrapper__3VBi" style="user-select: auto;"><a class="sql-schema-link__3cEg" style="user-select: auto;">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2" style="user-select: auto;"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z" style="user-select: auto;"></path></svg></a></div><div style="user-select: auto;"><p style="user-select: auto;">Table: <code style="user-select: auto;">Accounts</code></p>

<pre style="position: relative; user-select: auto;">+-------------+------+
| Column Name | Type |
+-------------+------+
| account_id  | int  |
| income      | int  |
+-------------+------+
account_id is the primary key (column with unique values) for this table.
Each row contains information about the monthly income for one bank account.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;">Write a solution&nbsp;to calculate the number of bank accounts for each salary category. The salary categories are:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">"Low Salary"</code>: All the salaries <strong style="user-select: auto;">strictly less</strong> than <code style="user-select: auto;">$20000</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">"Average Salary"</code>: All the salaries in the <strong style="user-select: auto;">inclusive</strong> range <code style="user-select: auto;">[$20000, $50000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">"High Salary"</code>: All the salaries <strong style="user-select: auto;">strictly greater</strong> than <code style="user-select: auto;">$50000</code>.</li>
</ul>

<p style="user-select: auto;">The result table <strong style="user-select: auto;">must</strong> contain all three categories. If there are no accounts in a category,&nbsp;return&nbsp;<code style="user-select: auto;">0</code>.</p>

<p style="user-select: auto;">Return the result table in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">The&nbsp;result format is in the following example.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
Accounts table:
+------------+--------+
| account_id | income |
+------------+--------+
| 3          | 108939 |
| 2          | 12747  |
| 8          | 87709  |
| 6          | 91796  |
+------------+--------+
<strong style="user-select: auto;">Output:</strong> 
+----------------+----------------+
| category       | accounts_count |
+----------------+----------------+
| Low Salary     | 1              |
| Average Salary | 0              |
| High Salary    | 3              |
+----------------+----------------+
<strong style="user-select: auto;">Explanation:</strong> 
Low Salary: Account 2.
Average Salary: No accounts.
High Salary: Accounts 3, 6, and 8.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>
</div>