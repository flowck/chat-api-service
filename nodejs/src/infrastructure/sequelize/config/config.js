require("dotenv/config");

const { PG_USERNAME, PG_PASSWORD, PG_HOST, PG_DATABASE_NAME, NODE_ENV } = process.env;

const defaultConfig = {
  host: PG_HOST,
  dialect: "postgres",
  username: PG_USERNAME,
  password: PG_PASSWORD,
  database: `${PG_DATABASE_NAME}_${NODE_ENV}`,
};

module.exports = {
  test: defaultConfig,
  production: defaultConfig,
  development: defaultConfig,
};
