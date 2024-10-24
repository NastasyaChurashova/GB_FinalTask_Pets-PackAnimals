CREATE TABLE AllAnimals AS
SELECT 'Pets' AS SourceTable, ID, Name, Type, BirthDate, Commands FROM Pets
UNION ALL
SELECT 'PackAnimals' AS SourceTable, ID, Name, Type, BirthDate, Commands FROM PackAnimals
UNION ALL
SELECT 'HorsesAndDonkeys' AS SourceTable, ID, Name, Type, BirthDate, Commands FROM HorsesAndDonkeys;

SELECT * FROM AllAnimals;