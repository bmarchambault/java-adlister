
USE adlister_db;



TRUNCATE users;

INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (1, 'bartoletti.ward', 'emmet72@example.org', 'c6d31762504c3bb141c77b0723f3ccac792ce253');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (2, 'erik.breitenberg', 'krystal71@example.org', '5f438c01b2fbafbddbff0f179935a15ce12f3adb');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (3, 'joan.waters', 'ivon@example.net', '3b5f473e33babe3577abf0e79ca71bd127fea2a0');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (4, 'marquardt.marques', 'nelson81@example.net', '289d879b76e0d4001102d306a7f1c81b35fb62ab');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (5, 'claudia41', 'ida.hayes@example.org', 'eb5ed4b07e5b5ef52a2fedbb7ebae2a051186636');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (6, 'hazle64', 'timmothy88@example.com', '7c417b54d1faccbd17a316454e88a1ee645d90df');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (7, 'lukas.kshlerin', 'clotilde.bergstrom@example.net', '761abf86866cd2e041cfff3b0ad55a9df9de048e');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (8, 'marietta69', 'zschultz@example.org', 'abace3920d94214d06fb1a068ce01b1be5e2b93c');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (9, 'aaron42', 'orie95@example.org', 'd1c57e8ae272ba18f5484b7fec8fad618c564116');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (10, 'cristopher14', 'otorp@example.org', 'f1d13ce48da539cb9ce6d140b7cd5773a67b3510');



TRUNCATE ads;


INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (1, 1, 'Aliquid aliquid quas corrupti odit reprehenderit vero.', 'Eos sunt amet laboriosam. Vitae impedit veniam distinctio porro cum et ratione. Odit voluptatibus facilis maxime consectetur quia explicabo. Eveniet quibusdam dolorem autem.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (2, 2, 'Tempore maxime et consequuntur velit.', 'Laboriosam quis nihil in ut architecto sed quis. Qui qui exercitationem corporis. Aut nisi fugit omnis laudantium voluptate eos natus et.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (3, 3, 'Et amet cumque esse recusandae accusamus.', 'Et architecto sint quos tenetur. Optio unde similique sunt ut. Ut animi aliquid iure non molestias. Eius doloribus ipsa qui dolores.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (4, 4, 'Ut quasi omnis nemo laborum dolores natus ut.', 'Autem provident tempora dolores alias. Ut libero sint ipsa excepturi aut. Sed nam in sed et dolorum cum quod. Doloremque facere velit ut.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (5, 5, 'Ea aut eligendi aliquam quis quo aut.', 'Aperiam eligendi culpa in quae voluptatibus aspernatur deleniti accusamus. Voluptates quia laboriosam aliquid aut ipsum. Totam unde delectus sed dolorum animi odio et cumque.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (6, 6, 'Eligendi molestias et sunt exercitationem quia sint temporibus.', 'Est nihil et facilis omnis. Est nemo debitis et rerum et impedit tempore. Iusto mollitia voluptate excepturi iure ipsum cupiditate saepe.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (7, 7, 'Voluptatem quia sint assumenda assumenda sint rerum officia ut.', 'Eos quo nisi quam necessitatibus. Et aut nihil ut accusantium quasi ipsa quisquam omnis. Cum unde in quia saepe explicabo ea expedita.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (8, 8, 'Repudiandae qui non dicta fuga et quae.', 'Illum sed alias repudiandae sequi aut. Dicta ex quo error qui tempore nihil est. Mollitia sit tempore necessitatibus natus sunt officiis facere. Maxime quas aliquam provident quis iure.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (9, 9, 'Assumenda consectetur et amet sed mollitia consequuntur qui.', 'Assumenda fugit est tempore eum ut quibusdam aut. Ut rerum voluptates optio sed sed. Et sed a exercitationem molestias sit autem.');
INSERT INTO `ads` (`id`, `user_id_fk`, `title`, `description`) VALUES (10, 10, 'Vitae cupiditate et nam quod deserunt.', 'Iure quos asperiores quis sequi quia id facere deserunt. Dignissimos quasi voluptatibus quia ex enim. Sint sit qui in et et nam aspernatur.');

