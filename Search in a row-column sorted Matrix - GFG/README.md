# Search in a row-column sorted Matrix
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a matrix of size&nbsp;n x m, where every row and column is<strong style="user-select: auto;"> sorted in increasing order</strong>, and a number <strong style="user-select: auto;">x.</strong>&nbsp;Find whether&nbsp;element x&nbsp;is present in the matrix or not.</span><br style="user-select: auto;">
<br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
&nbsp;             {36, 43, 60},
&nbsp;             {40, 51, 69}}
<strong style="user-select: auto;">Output</strong>: 0
<strong style="user-select: auto;">Explanation</strong>:
62 is not present in the matrix, 
so output is 0.
</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="position: relative; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
<strong style="user-select: auto;">Output</strong>: 1
<strong style="user-select: auto;">Explanation</strong>: 55 is present in the matrix.</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Complete the function <strong style="user-select: auto;">search()</strong> that takes <strong style="user-select: auto;">n, m, x, </strong>and <strong style="user-select: auto;">matrix[][]</strong>&nbsp;as input parameters and <strong style="user-select: auto;">returns a boolean value.</strong> True&nbsp;if x is present in the matrix and false&nbsp;if it is not present.<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N + M)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N, M &lt;= 1000<br style="user-select: auto;">
1 &lt;= mat[][] &lt;= 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 &lt;= X &lt;= 1000</span></p>
</div>