<h2><a href="https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/">1170. Compare Strings by Frequency of the Smallest Character</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Let the function <code style="user-select: auto;">f(s)</code> be the <strong style="user-select: auto;">frequency of the lexicographically smallest character</strong> in a non-empty string <code style="user-select: auto;">s</code>. For example, if <code style="user-select: auto;">s = "dcce"</code> then <code style="user-select: auto;">f(s) = 2</code> because the lexicographically smallest character is <code style="user-select: auto;">'c'</code>, which has a frequency of 2.</p>

<p style="user-select: auto;">You are given an array of strings <code style="user-select: auto;">words</code> and another array of query strings <code style="user-select: auto;">queries</code>. For each query <code style="user-select: auto;">queries[i]</code>, count the <strong style="user-select: auto;">number of words</strong> in <code style="user-select: auto;">words</code> such that <code style="user-select: auto;">f(queries[i])</code> &lt; <code style="user-select: auto;">f(W)</code> for each <code style="user-select: auto;">W</code> in <code style="user-select: auto;">words</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an integer array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;">, where each </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the answer to the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> query</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> queries = ["cbd"], words = ["zaaaz"]
<strong style="user-select: auto;">Output:</strong> [1]
<strong style="user-select: auto;">Explanation:</strong> On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") &lt; f("zaaaz").
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
<strong style="user-select: auto;">Output:</strong> [1,2]
<strong style="user-select: auto;">Explanation:</strong> On the first query only f("bbb") &lt; f("aaaa"). On the second query both f("aaa") and f("aaaa") are both &gt; f("cc").
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= queries.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= queries[i].length, words[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">queries[i][j]</code>, <code style="user-select: auto;">words[i][j]</code> consist of lowercase English letters.</li>
</ul>
</div>