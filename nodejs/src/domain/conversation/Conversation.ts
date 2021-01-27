import { v4 as uuid } from "uuid";

export interface ICreateConversation {}
export interface IConversation {}

export default class Conversation {
  private _id!: string;
  private _createdAt!: Date;

  set id(value: string) {
    this._id = value;
  }

  get id(): string {
    return this.id;
  }

  set createdAt(value: Date) {
    this._createdAt = value;
  }

  get createdAt(): Date {
    return this.createdAt;
  }

  constructor() {}

  public static create(conversation: ICreateConversation) {}
}
