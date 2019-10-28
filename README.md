

To accomplish each of the tasks, it is enough to develop an API without FrontEnd implementation.

There is a stock register:
text box - "Comment"
integer fields - "Amount of authorized capital", "EDRPOU institutions", "Quantity"
decimal fields - "Total Nominal Value" *, "Nominal Value", "State Duty Paid"
date - "Release Date"

* "Total Nominal Value" is calculated by multiplying "Quantity" by "Nominal Value".

Required:
1. Develop the functionality of creating a new stock record.
2. Develop action editing functionality with mandatory history of changes.
3. Develop a functional that will return:
a) "public data" - "ERDPOU institutions", "Quantity", "Total nominal value", "Nominal value" and "Issue date";
b) "private data" means all information about the promotion and its changes.
4. Develop functionalities for viewing all the shares of one institution, both "publicly" and "privately".
5. Develop filtering and sorting functionality (with pagination capability).