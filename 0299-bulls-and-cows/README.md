<h2><a href="https://leetcode.com/problems/bulls-and-cows/">299. Bulls and Cows</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are playing the <strong style="user-select: auto;"><a href="https://en.wikipedia.org/wiki/Bulls_and_Cows" target="_blank" style="user-select: auto;">Bulls and Cows</a></strong> game with your friend.</p>

<p style="user-select: auto;">You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of "bulls", which are digits in the guess that are in the correct position.</li>
	<li style="user-select: auto;">The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.</li>
</ul>

<p style="user-select: auto;">Given the secret number <code style="user-select: auto;">secret</code> and your friend's guess <code style="user-select: auto;">guess</code>, return <em style="user-select: auto;">the hint for your friend's guess</em>.</p>

<p style="user-select: auto;">The hint should be formatted as <code style="user-select: auto;">"xAyB"</code>, where <code style="user-select: auto;">x</code> is the number of bulls and <code style="user-select: auto;">y</code> is the number of cows. Note that both <code style="user-select: auto;">secret</code> and <code style="user-select: auto;">guess</code> may contain duplicate digits.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> secret = "1807", guess = "7810"
<strong style="user-select: auto;">Output:</strong> "1A3B"
<strong style="user-select: auto;">Explanation:</strong> Bulls are connected with a '|' and cows are underlined:
"1807"
  |
"<u style="user-select: auto;">7</u>8<u style="user-select: auto;">10</u>"</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> secret = "1123", guess = "0111"
<strong style="user-select: auto;">Output:</strong> "1A1B"
<strong style="user-select: auto;">Explanation:</strong> Bulls are connected with a '|' and cows are underlined:
"1123"        "1123"
  |      or     |
"01<u style="user-select: auto;">1</u>1"        "011<u style="user-select: auto;">1</u>"
Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= secret.length, guess.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">secret.length == guess.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">secret</code> and <code style="user-select: auto;">guess</code> consist of digits only.</li>
</ul>
</div>