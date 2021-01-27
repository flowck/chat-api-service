import { IMessage } from "./../message/Message";
import { v4 as uuid } from "uuid";

export interface ICreateConversation {}

export interface IConversation {
  id: string;
  createdAt: Date;
  messages: IMessage[];
}

export default class Conversation {
  private _id!: string;
  private _createdAt!: Date;
  private _messages!: IMessage[];

  set id(value: string) {
    this._id = value;
  }

  get id(): string {
    return this._id;
  }

  set createdAt(value: Date) {
    this._createdAt = value;
  }

  get createdAt(): Date {
    return this._createdAt;
  }

  set messages(value: IMessage[]) {
    this._messages = value;
  }

  get messages(): IMessage[] {
    return this._messages;
  }

  constructor({ id, messages, createdAt }: IConversation) {
    this.id = id;
    this.messages = messages;
    this.createdAt = createdAt;
  }

  public static create(): Conversation {
    return new Conversation({
      id: uuid(),
      messages: [],
      createdAt: new Date(),
    });
  }
}
