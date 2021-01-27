import IRepository from "../IRepository";
import Conversation, { IConversation } from "./Conversation";

export default interface IConversationRepository
  extends IRepository<IConversation, string> {}
