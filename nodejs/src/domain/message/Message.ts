export interface ICreateMessage {
  userId: string;
  message: string;
  conversationId: string;
}

export interface IMessage extends ICreateMessage {
  id: string;
}

export default class Message {
  private _id!: string;
  private _userId!: string;
  private _message!: string;
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

  public get userId(): string {
    return this._userId;
  }

  public set userId(value: string) {
    this._userId = value;
  }

  public set conversationId(value: string) {
    this._conversationId = value;
  }

  constructor(message: IMessage) {}

  public static create(message: ICreateMessage) {}
}
