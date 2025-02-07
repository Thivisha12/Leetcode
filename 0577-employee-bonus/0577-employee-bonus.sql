SELECT e.name, # return name and bonus cols
       b.bonus
FROM Employee AS e # include all employees
LEFT JOIN Bonus AS b # connect bonus rows with same empId
    ON e.empID = b.empID
WHERE b.bonus < 1000 # bonus is less than 1000 or no bonus
    OR b.bonus IS NULL;