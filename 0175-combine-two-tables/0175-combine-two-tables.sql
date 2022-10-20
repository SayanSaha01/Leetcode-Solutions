/*select firstName,lastName,city,state from Person inner join Address where Person.personId = Address.personId;

Inner Join will bring only when data is present in both tables, whereas left join will bring data of all rows in the Person table regardless of data present in Address Table.*/

select firstName,lastName,city,state from Person left join Address on Person.personId = Address.personId;