export default interface IRepository<Entity, ID> {
  findAll(): Entity[];
  delete(id: ID): void;
  findById(id: ID): Entity;
  create(payload: Entity): Entity;
  update(id: ID, payload: Entity): Entity;
}
