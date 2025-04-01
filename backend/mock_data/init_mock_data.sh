#!/bin/bash

echo "Initializing schema"
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/schema.sql

echo "Initializing data"
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/account_balances.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/account_details.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/account_flags.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/accounts.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/banners.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/debit_card_design.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/debit_card_details.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/debit_card_status.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/debit_cards.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/transactions.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/user_greetings.sql
docker exec -i backend-db-1 mysql -uroot -ppassword springboot < mock_data/users.sql

echo "Done."