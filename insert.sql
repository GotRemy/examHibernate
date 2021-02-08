INSERT INTO `user` (`id`, `email`, `nom`, `num_telephone`, `password`, `prenom`, `roles`, `username`) VALUES
(1, 'titi@gmail.com', 'titi', '0102030405', 'titititi', 'ti', 'user', 'tit'),
(2, 'toto@gmail.com', 'toto', '0504030201', 'totototo', 'to', 'admin', 'tot');

INSERT INTO `garage` (`id`, `code_postal`, `nom`, `num_siret`, `num_telephone`, `rue`, `ville`, `user_id`) VALUES
(1, '63170', 'Divoso', '442 293 775 00031', '0501040203', '20 pierre', 'Aubiere', 1),
(2, '63000', 'Payaxa', '442 293 775 00032', '0105020403', '30 caillou', 'Clermont Ferrand', 2);

INSERT INTO `car` (`id`, `annee`, `carburant`, `date_ajout`, `description`, `kilometrage`, `marque`, `modele`, `prix`, `garage_id`) VALUES
(1, 1990, 'essence', '2021-02-01', 'voiture 1', 1000, 'Peugeot', '208', 5000, 1),
(2, 1991, 'diesel', '2021-02-02', 'voiture 2', 2000, 'Renault', 'Clio', 6000, 2),
(3, 1991, 'essence', '2021-02-03', 'voiture 3', 3000, 'Fiat', '500', 7000, 1),
(4, 1993, 'diesel', '2021-02-04', 'voiture 4', 4000, 'Peugeot', '3008', 8000, 2),
(5, 1994, 'essence', '2021-02-05', 'voiture 5', 5000, 'Renault', 'Captur', 9000, 1),
(6, 1995, 'diesel', '2021-02-06', 'voiture 6', 6000, 'Fiat', 'Tipo', 10000, 2),
(7, 1996, 'essence', '2021-02-07', 'voiture 7', 7000, 'Peugeot', '308', 11000, 1),
(8, 1997, 'diesel', '2021-02-08', 'voiture 8', 8000, 'Renault', 'Kangoo', 12000, 2),
(9, 1998, 'essence', '2021-02-09', 'voiture 9', 9000, 'Fiat', 'Panda', 13000, 1),
(10, 1999, 'diesel', '2021-02-10', 'voiture 10', 10000, 'Peugeot', '2008', 14000, 2),
(11, 2000, 'electrique', '2021-02-11', 'voiture 11', 0, 'Tesla', 'Model X', 99990, 1);

INSERT INTO `color` (`id`, `libelle`) VALUES
(1, 'rouge'),
(2, 'blanc'),
(3, 'bleu'),
(4, 'gris'),
(5, 'noir');

INSERT INTO `color_car` (`color_id`, `car_id`) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 1);