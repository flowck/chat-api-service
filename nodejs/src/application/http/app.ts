import "dotenv/config";
import cors from "cors";
import helmet from "helmet";
import express from "express";

const app = express();
const { PORT, ENV } = process.env;

app.use(cors());
app.use(helmet());
// app.use("/api", controllersV1);

if (ENV !== "test") {
  app.listen(PORT, () => console.log(`Application listening at ${PORT} port.`));
}

export default app;
