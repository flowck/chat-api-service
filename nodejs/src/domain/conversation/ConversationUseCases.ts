import Conversation, { IConversation, ICreateConversation } from "./Conversation";
import IConversationRepository from "./IConversationRepository";

export default class ConversationUseCases {
  private repository!: IConversationRepository;

  constructor(repository: IConversationRepository) {
    this.repository = repository;
  }

  public createConversation() {
    const conversation = Conversation.create();
    return this.repository.create(conversation);
  }
}
