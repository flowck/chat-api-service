"use strict";
const { Model } = require("sequelize");
module.exports = (sequelize, DataTypes) => {
  class messages extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // define association here
    }
  }
  messages.init(
    {
      id: {
        allowNull: false,
        primaryKey: true,
        type: DataTypes.UUID,
        defaultValue: DataTypes.UUIDV4,
      },
      userId: {
        type: DataTypes.UUID,
        references: {
          key: "id",
          model: "users",
        },
      },
      content: DataTypes.STRING,
      conversationId: {
        type: DataTypes.UUID,
        references: {
          key: "id",
          model: "conversations",
        },
      },
    },
    {
      sequelize,
      modelName: "messages",
    }
  );
  return messages;
};
