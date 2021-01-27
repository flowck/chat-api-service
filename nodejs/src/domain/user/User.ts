import bcrypt from "bcrypt";
import { v4 as uuid } from "uuid";

export interface ICreateUser {
  email: string;
  username: string;
  password: string;
}

export interface IUser {
  id: string;
  email: string;
  username: string;
  password?: string;
}

export default class User {
  private _id!: string;
  private _email!: string;
  private _username!: string;
  private _password!: string;

  public constructor({ id, email, username, password }: IUser) {
    this.id = id;
    this.email = email;
    this.username = username;
    if (password) this.password = password;
  }

  public get id(): string {
    return this._id;
  }

  public set id(value: string) {
    this._id = value;
  }

  public get email(): string {
    return this._email;
  }

  public set email(value: string) {
    this._email = value;
  }

  public get username(): string {
    return this._username;
  }

  public set username(value: string) {
    this._username = value;
  }

  public get password(): string {
    return this._password;
  }

  public set password(value: string) {
    this._password = value;
  }

  public static create({ username, email, password }: ICreateUser) {
    password = bcrypt.hashSync(password, 10);
    return new User({ id: uuid(), email, username, password });
  }
}
