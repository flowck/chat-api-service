import { v4 as uuid } from "uuid";

export interface ICreateMessage {
  userId: string;
  message: string;
  conversationId: string;
}

export interface IMessage extends ICreateMessage {
  id: string;
  createdAt: Date;
}

export default class Message {
  private _id!: string;
  private _userId!: string;
  private _message!: string;
  private _createdAt!: Date;
  private _conversationId!: string;

  public get id(): string {
    return this._id;
  }

  public set id(value: string) {
    this._id = value;
  }

  public get message(): string {
    return this._message;
  }

  public set message(value: string) {
    this._message = value;
  }

  public get conversationId(): string {
    return this._conversationId;
  }

  public set conversationId(value: string) {
    this._conversationId = value;
  }

  public get userId(): string {
    return this._userId;
  }

  public set userId(value: string) {
    this._userId = value;
  }

  set createdAt(value: Date) {
    this._createdAt = value;
  }

  get createdAt(): Date {
    return this._createdAt;
  }

  constructor({ id, userId, conversationId, createdAt }: IMessage) {
    this.id = id;
    this.userId = userId;
    this.createdAt = createdAt;
    this.conversationId = conversationId;
  }

  public static create({ userId, conversationId, message }: ICreateMessage) {
    return new Message({
      id: uuid(),
      userId,
      conversationId,
      message,
      createdAt: new Date(),
    });
  }
}
