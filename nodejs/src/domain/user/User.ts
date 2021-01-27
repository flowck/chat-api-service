import { v4 as uuid } from "uuid";

export interface ICreateUser {
  username: string;
  password: string;
}

export interface IUser {
  id: string;
  username: string;
  password: string;
}

export default class User {
  private _id!: string;
  private _username!: string;
  private _password!: string;

  public constructor({ id, username }: IUser) {
    this.id = id;
    this.username = username;
  }

  public get id(): string {
    return this._id;
  }

  public set id(value: string) {
    this._id = value;
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

  public static create({ username, password }: ICreateUser) {
    return new User({ id: uuid(), username, password });
  }
}
