DELIMITER  $$
DROP PROCEDURE IF EXISTS createBenutzer;
create PROCEDURE createBenutzer(IN Nachname varchar(100), IN Vorname VARCHAR(100), IN Ausbildungsbeginn DATE, IN Rolle varchar(20))
  BEGIN
    DECLARE var_lastId int;
    insert INTO benutzer(Vorname, Nachname, Ausbildungsbeginn) VALUES (Vorname,Nachname,Ausbildungsbeginn);
    SET var_lastId = (SELECT LAST_INSERT_ID());



 --   INSERT Into rolle VALUES (Bezeichnung,var_lastId);


  END $$
DELIMITER ;